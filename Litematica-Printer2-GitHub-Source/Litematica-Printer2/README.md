# Litematica Printer2

A companion Meteor Client addon prototype that adds a toggleable **10-block client-side interaction reach** intended for use alongside an existing Litematica Printer installation.

> **Compatibility status:** Source scaffold for Minecraft Java 26.2 / Meteor 26.2. This has not been compiled or tested against the exact 26.2 mappings/API. The reach mixin target may need adjustment to the Meteor/Minecraft build you use. It does not include Litematica Printer itself.

## Requirements

- Minecraft Java Edition 26.2
- Fabric Loader and Fabric API versions compatible with your 26.2 profile
- Meteor Client 26.2
- Litematica + MaLiLib, and a compatible Litematica Printer addon

## What it does

- Registers a Meteor module named **Litematica Printer2**.
- Provides an enable/disable toggle for a 10-block client interaction reach override.
- Keeps the printer implementation separate: use your existing printer module for schematic-based placement.

## Important limitations

This is a **client-side reach override prototype**, not a guarantee of 10-block placement. Servers can reject interactions beyond their allowed reach, and anti-cheat may flag unusual interactions. Only use it where the server permits it. It does not alter server-side reach.

The 26.2 Minecraft/Meteor APIs are moving targets. The mixin method signature in `Printer2ReachMixin.java` may need to be updated to match your exact client build before it compiles or works.

## Build

Use Java 25 (required by many 26.2 toolchains) and a compatible Gradle/Fabric Loom setup.

1. Open this folder in IntelliJ IDEA.
2. Set the Minecraft, Fabric Loader, Fabric API, Loom, and Meteor dependency versions to the versions used by your 26.2 installation.
3. Run `gradle build`.
4. Put the built JAR from `build/libs/` into your Minecraft `mods` folder alongside Meteor and the required Litematica dependencies.

This repository is intentionally a source starter rather than a prebuilt JAR because the exact compatible 26.2 dependency versions and mappings need to be confirmed against your installation.

## GitHub

Create a new GitHub repository named `Litematica-Printer2`, then upload these files or extract the ZIP and run:

```bash
git init
git add .
git commit -m "Initial Litematica Printer2 addon"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/Litematica-Printer2.git
git push -u origin main
```

## Credits

- Meteor Client addon API
- Original Meteor Litematica Printer project: https://github.com/kkllffaa/meteor-litematica-printer
