# Roteiro · plantilla de partida

Proyecto vacío con solo `MainActivity` y `activity_main.xml`. Gradle ya viene preparado
para Android Studio Panda (equipos del aula): no hay que tocar `libs.versions.toml`
ni los `build.gradle.kts`.

Ya incluye:

- AGP 9.0.1 · Gradle 9.1.0 · compileSdk 36
- Navigation 2.9.8 (`navigation-fragment-ktx` y `navigation-ui-ktx`)
- Safe Args (`androidx.navigation.safeargs.kotlin`), declarado en la raíz y aplicado en `app`
- View Binding activado
- Kotlin integrado en AGP 9: no lleva el plugin `org.jetbrains.kotlin.android`
- Todos los textos de la app ya en `res/values/strings.xml`, y las provincias en
  `res/values/arrays.xml`. Mientras no se usen, Android Studio los marca como «no usados»: es un aviso, no un error.

## Abrirlo

1. Descomprime el zip.
2. En Android Studio: **File → Open** y elige la carpeta `Roteiro`, la que tiene `settings.gradle.kts`.
3. Espera a que termine la sincronización. La primera vez descarga dependencias y tarda.
4. Si aparece el **AGP Upgrade Assistant**, no lo aceptes.
5. Ejecuta: tiene que salir «Roteiro» en el centro de la pantalla.
