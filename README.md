<div align="center">
<img src="https://cdn.wynncraft.com/img/logo.png">
<h1>Wynncraft4J • Java API Wrapper</h1>
<img src="https://flat.badgen.net/github/stars/oHate/Wynncraft4J">
<img src="https://flat.badgen.net/github/release/oHate/Wynncraft4J">
<img src="https://flat.badgen.net/github/license/oHate/Wynncraft4J">
</div>

# Installation

**Maven**

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependencies>
    <dependency>
        <groupId>com.github.oHate</groupId>
        <artifactId>Wynncraft4J</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```

**Gradle**

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

```groovy
dependencies {
    implementation 'com.github.oHate:Wynncraft4J:VERSION'
}
```

Replace VERSION with the latest [release](https://github.com/oHate/Wynncraft4J/releases).

# v3 API Progress

### Player Module
- [x] /player/\<str:username/uuid\>
- [x] /player/\<str:username/uuid\>?fullResult
- [x] /player/\<str:username/uuid\>/characters
- [x] /player/\<str:username/uuid\>/characters/\<str:characterUuid\>
- [x] /player/\<str:username/uuid\>/characters/\<str:characterUuid\>/abilities
- [ ] /player&server=\<str/int:WC1/1, WC2/2\>

### Guild Module
- [x] /guild/\<str:guildName\> 
- [x] /guild/prefix/\<str:guildName\> 
- [x] /guild/uuid/\<str:uuid\>
- [x] /guild/list/guild
- [x] /guild/list/territory

### Item Module
**WIP:** base, identifications, and requirements
- [x] /item/database
- [x] /item/search (Simple)
- [ ] /item/search (Advanced)
- [ ] /item/metadata