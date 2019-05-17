enablePlugins(ScalaJSPlugin)

name := "front"
scalaVersion := "2.11.12"
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
libraryDependencies += "com.lihaoyi" %%% "upickle" % "0.7.1"

enablePlugins(Angulate2Plugin, LiteServerPlugin)

ngBootstrap := Some("AppModule")

systemJSMappings in fastOptJS ++= Seq(
      "@angular/core"                     -> "npm:@angular/core/bundles/core.umd.js",
      "@angular/common"                   -> "npm:@angular/common/bundles/common.umd.js",
      "@angular/compiler"                 -> "npm:@angular/compiler/bundles/compiler.umd.js",
      "@angular/platform-browser"         -> "npm:@angular/platform-browser/bundles/platform-browser.umd.js",
      "@angular/platform-browser-dynamic" -> "npm:@angular/platform-browser-dynamic/bundles/platform-browser-dynamic.umd.js",
      "@angular/http"                     -> "npm:@angular/http/bundles/http.umd.js",
      "@angular/router"                   -> "npm:@angular/router/bundles/router.umd.js",
      "@angular/forms"                    -> "npm:@angular/forms/bundles/forms.umd.js",
      "@angular/upgrade"                  -> "npm:@angular/upgrade/bundles/upgrade.umd.js",
      // "@angular/material"                 -> "npm:@angular/material/bundles/material.umd.js",
      // "@angular/animations"               -> "npm:@angular/animations/bundles/animations.umd.js",
      // "@angular/cdk/platform"             -> "npm:@angular/cdk/bundles/cdk-platform.umd.js",
      // "@angular/cdk/a11y"                 -> "npm:@angular/cdk/bundles/cdk-a11y.umd.js",
      // "@angular/cdk/bidi"                 -> "npm:@angular/cdk/bundles/cdk-bidi.umd.js",
      // "@angular/cdk/coercion"             -> "npm:@angular/cdk/bundles/cdk-coercion.umd.js",
      // "@angular/cdk/keycodes"             -> "npm:@angular/cdk/bundles/cdk-keycodes.umd.js",
      // "@angular/cdk/scrolling"            -> "npm:@angular/cdk/bundles/cdk-scrolling.umd.js",
      // "@angular/material/core"            -> "npm:@angular/material/bundles/material-core.umd.js",
      "rxjs"                              -> "npm:rxjs"
    )