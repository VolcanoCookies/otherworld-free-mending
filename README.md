# Otherworld Free Mending

Allows every class to use Mending in Otherworld v8 HF2 (Minecraft 1.20.1, Forge, Otherworld Origins 2.0.1). The mixin removes only `minecraft:mending` from Otherworld Origins' class restriction map.

Put the [release JAR](https://github.com/VolcanoCookies/otherworld-free-mending/releases) in the pack's `mods` directory. For multiplayer, install it on the server for XP repair and on clients to update the class-lock tooltip and class description.

Build with JDK 17 and `./gradlew build` (or `gradlew.bat build` on Windows). The JAR is in `build/libs/`.

Woodpecker builds on pushes and publishes the JAR to GitHub Releases on tag pushes. Set the repository secret `github_release_token` for tag events only, using a GitHub token with Contents read/write access to this repository.
