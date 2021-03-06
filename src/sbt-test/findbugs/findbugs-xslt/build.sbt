name := "findbugs-report"

organization := "uk.co.josephearl"

version := "2.3.0"

findbugsReportPath := Some(target.value / "findbugs-report.xml")

findbugsXsltTransformations := Some(Set(FindBugsXSLTTransformation(baseDirectory(_ / "xsl" / "default.xsl").value, target(_ / "findbugs-report.html").value)))
