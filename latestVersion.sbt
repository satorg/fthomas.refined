ThisBuild / latestVersion := "0.9.29"

ThisBuild / bincompatVersions := Map(
  "2.12" -> Set(
    "0.10.0"
    // NEXT_VERSION
  ),
  "2.13" -> Set(
    "0.10.0"
    // NEXT_VERSION
  )
)

ThisBuild / unreleasedModules := Set(
  // Example:
  // "refined-eval"
)
