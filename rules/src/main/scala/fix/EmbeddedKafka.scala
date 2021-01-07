package fix

import scalafix.v1._

import scala.meta._

class EmbeddedKafka extends SemanticRule("EmbeddedKafka") {

  override def fix(implicit doc: SemanticDocument): Patch =
    doc.tree.collect {
      case t @ Import(importers) =>
        val newImporters = importers.map(importer =>
          importer.copy(ref = renameImportedPackage(importer.ref))
        )

        if (newImporters == importers) Patch.empty
        else Patch.replaceTree(t, t.copy(newImporters).toString)
    }.asPatch

  private def renameImportedPackage(term: Term): Term.Ref = term match {
    case Term.Select(Term.Name("net"), Term.Name("manub")) =>
      Term.Select(Term.Name("io"), Term.Name("github"))

    case select: Term.Select =>
      select.copy(qual = renameImportedPackage(select.qual))

    case name: Term.Name => name
  }

}
