# Changelog

## 0.1.0-alpha.6 (2025-02-06)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/terminaldotshop/terminal-sdk-java/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** manual updates ([#67](https://github.com/terminaldotshop/terminal-sdk-java/issues/67)) ([8c403bc](https://github.com/terminaldotshop/terminal-sdk-java/commit/8c403bcb44501da71d8f070e080f2f353b9b0170))

## 0.1.0-alpha.5 (2025-02-06)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/terminaldotshop/terminal-sdk-java/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **client:** send client-side timeout headers ([#64](https://github.com/terminaldotshop/terminal-sdk-java/issues/64)) ([33875ee](https://github.com/terminaldotshop/terminal-sdk-java/commit/33875ee07c693dbf248413bee093d59f5ae07674))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#65](https://github.com/terminaldotshop/terminal-sdk-java/issues/65)) ([a5abcfa](https://github.com/terminaldotshop/terminal-sdk-java/commit/a5abcfa612d7be9870619a45cb97c1a25280371c))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([a5abcfa](https://github.com/terminaldotshop/terminal-sdk-java/commit/a5abcfa612d7be9870619a45cb97c1a25280371c))
* **client:** add missing validation calls on response ([a5abcfa](https://github.com/terminaldotshop/terminal-sdk-java/commit/a5abcfa612d7be9870619a45cb97c1a25280371c))
* **client:** always provide a body for `PATCH` methods ([a5abcfa](https://github.com/terminaldotshop/terminal-sdk-java/commit/a5abcfa612d7be9870619a45cb97c1a25280371c))


### Chores

* **internal:** minor formatting/style changes ([a5abcfa](https://github.com/terminaldotshop/terminal-sdk-java/commit/a5abcfa612d7be9870619a45cb97c1a25280371c))
* **internal:** rename some tests ([a5abcfa](https://github.com/terminaldotshop/terminal-sdk-java/commit/a5abcfa612d7be9870619a45cb97c1a25280371c))


### Documentation

* fix incorrect additional properties info ([#62](https://github.com/terminaldotshop/terminal-sdk-java/issues/62)) ([5948868](https://github.com/terminaldotshop/terminal-sdk-java/commit/59488684132b21f7dfb292e4389d471ea08e3319))

## 0.1.0-alpha.4 (2025-01-30)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/terminaldotshop/terminal-sdk-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **client:** add `_queryParams` and `_headers` methods ([#57](https://github.com/terminaldotshop/terminal-sdk-java/issues/57)) ([c0236ee](https://github.com/terminaldotshop/terminal-sdk-java/commit/c0236eeb02e547f4f980c51054906ba7104f99ba))


### Bug Fixes

* **client:** don't leak responses when retrying ([#59](https://github.com/terminaldotshop/terminal-sdk-java/issues/59)) ([7812702](https://github.com/terminaldotshop/terminal-sdk-java/commit/7812702fd8e246c4e351d814e3994d730b10455a))


### Chores

* **internal:** improve `RetryingHttpClientTest` ([#58](https://github.com/terminaldotshop/terminal-sdk-java/issues/58)) ([3bf7913](https://github.com/terminaldotshop/terminal-sdk-java/commit/3bf7913aed72f0a3d47061112f546e7d39835f8b))


### Documentation

* builder, enum, and union comments ([#55](https://github.com/terminaldotshop/terminal-sdk-java/issues/55)) ([a1f1edf](https://github.com/terminaldotshop/terminal-sdk-java/commit/a1f1edf3638c1dcacbf144c9f265c5c8c5c754ab))


### Refactors

* **internal:** extract request preparation logic ([c0236ee](https://github.com/terminaldotshop/terminal-sdk-java/commit/c0236eeb02e547f4f980c51054906ba7104f99ba))

## 0.1.0-alpha.3 (2025-01-28)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/terminaldotshop/terminal-sdk-java/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **client:** add `close` method ([#49](https://github.com/terminaldotshop/terminal-sdk-java/issues/49)) ([8c29b6f](https://github.com/terminaldotshop/terminal-sdk-java/commit/8c29b6ffed351b5782cecf6e7377d954994ecbdc))


### Bug Fixes

* **client:** make some classes and constructors non-public ([#52](https://github.com/terminaldotshop/terminal-sdk-java/issues/52)) ([38a443f](https://github.com/terminaldotshop/terminal-sdk-java/commit/38a443f487550900fb1f5892010e4ba5467384f7))


### Chores

* add max retries to test ([#48](https://github.com/terminaldotshop/terminal-sdk-java/issues/48)) ([dfca26d](https://github.com/terminaldotshop/terminal-sdk-java/commit/dfca26d25aeddf6e2419f1ecd5ba16b09c1593e0))
* **internal:** codegen related update ([#46](https://github.com/terminaldotshop/terminal-sdk-java/issues/46)) ([d3be091](https://github.com/terminaldotshop/terminal-sdk-java/commit/d3be091d6e01607acd02cea5d98e4859b93993c0))
* **internal:** remove some unnecessary `constructor` keywords ([38a443f](https://github.com/terminaldotshop/terminal-sdk-java/commit/38a443f487550900fb1f5892010e4ba5467384f7))


### Documentation

* `async` and `sync` method comments ([#51](https://github.com/terminaldotshop/terminal-sdk-java/issues/51)) ([c240add](https://github.com/terminaldotshop/terminal-sdk-java/commit/c240add3c5dcc32ea048d7d588a169f80400d678))
* add client documentation ([#50](https://github.com/terminaldotshop/terminal-sdk-java/issues/50)) ([d12e35d](https://github.com/terminaldotshop/terminal-sdk-java/commit/d12e35d6c957df36cf6013d69da76c51007640dc))

## 0.1.0-alpha.2 (2025-01-24)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/terminaldotshop/terminal-sdk-java/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** manual updates ([#22](https://github.com/terminaldotshop/terminal-sdk-java/issues/22)) ([48058b7](https://github.com/terminaldotshop/terminal-sdk-java/commit/48058b7926258f5cdb3a852e92ba055e8ed80803))


### Chores

* **docs:** add example project ([#27](https://github.com/terminaldotshop/terminal-sdk-java/issues/27)) ([c0f674f](https://github.com/terminaldotshop/terminal-sdk-java/commit/c0f674f917666ad306e7ec127d44fe3b78d6b7e0))
* **docs:** update readme ([#24](https://github.com/terminaldotshop/terminal-sdk-java/issues/24)) ([9614512](https://github.com/terminaldotshop/terminal-sdk-java/commit/96145128c2c3977d90532263f69cbf631a74eb5d))
* **docs:** update readme ([#26](https://github.com/terminaldotshop/terminal-sdk-java/issues/26)) ([8c31e25](https://github.com/terminaldotshop/terminal-sdk-java/commit/8c31e257bcf1e14e93293fa0ad94dc2c06a0303e))
* **docs:** update readme ([#29](https://github.com/terminaldotshop/terminal-sdk-java/issues/29)) ([1181714](https://github.com/terminaldotshop/terminal-sdk-java/commit/118171455ae8797acf07e368ef5edacfaf377b32))
* **internal:** codegen related update ([#25](https://github.com/terminaldotshop/terminal-sdk-java/issues/25)) ([8703d55](https://github.com/terminaldotshop/terminal-sdk-java/commit/8703d556b2c4c3379bed8698ca92c77515d0d134))
* **internal:** codegen related update ([#28](https://github.com/terminaldotshop/terminal-sdk-java/issues/28)) ([b1dc48f](https://github.com/terminaldotshop/terminal-sdk-java/commit/b1dc48fe583266846fee2b587cd872a02efd4d47))
* **internal:** codegen related update ([#30](https://github.com/terminaldotshop/terminal-sdk-java/issues/30)) ([f3e561d](https://github.com/terminaldotshop/terminal-sdk-java/commit/f3e561d44ea9760591a750f5f771cd61b99398b9))
* **internal:** codegen related update ([#31](https://github.com/terminaldotshop/terminal-sdk-java/issues/31)) ([f131078](https://github.com/terminaldotshop/terminal-sdk-java/commit/f131078c3ceb97ebb41edccf122b41125312cbc2))
* **internal:** codegen related update ([#32](https://github.com/terminaldotshop/terminal-sdk-java/issues/32)) ([7d7a3e9](https://github.com/terminaldotshop/terminal-sdk-java/commit/7d7a3e9a2fce8e0336336df10662fab216117610))
* **internal:** codegen related update ([#33](https://github.com/terminaldotshop/terminal-sdk-java/issues/33)) ([0c9c400](https://github.com/terminaldotshop/terminal-sdk-java/commit/0c9c4009041193bcaf6c4deed47d9090ee6a61da))
* **internal:** codegen related update ([#34](https://github.com/terminaldotshop/terminal-sdk-java/issues/34)) ([6907272](https://github.com/terminaldotshop/terminal-sdk-java/commit/6907272ea905f138e6da77913f191481aa9bc23c))
* **internal:** codegen related update ([#35](https://github.com/terminaldotshop/terminal-sdk-java/issues/35)) ([a08683e](https://github.com/terminaldotshop/terminal-sdk-java/commit/a08683e389523261f2e20031768917552fec8cdc))
* **internal:** codegen related update ([#36](https://github.com/terminaldotshop/terminal-sdk-java/issues/36)) ([21bc7a6](https://github.com/terminaldotshop/terminal-sdk-java/commit/21bc7a6933fe699ee52b7c4f11729a2f8f7ae6ad))
* **internal:** codegen related update ([#37](https://github.com/terminaldotshop/terminal-sdk-java/issues/37)) ([96984dd](https://github.com/terminaldotshop/terminal-sdk-java/commit/96984dd43a59212392e81519a0daaf3c1ab2cb9f))
* **internal:** codegen related update ([#38](https://github.com/terminaldotshop/terminal-sdk-java/issues/38)) ([599b6e2](https://github.com/terminaldotshop/terminal-sdk-java/commit/599b6e2a8dcc71c4fcfbbec4335225e9ebc75325))
* **internal:** codegen related update ([#39](https://github.com/terminaldotshop/terminal-sdk-java/issues/39)) ([466dc7e](https://github.com/terminaldotshop/terminal-sdk-java/commit/466dc7edf929856c1cb6d2dfd0ed3c5d0044864f))
* **internal:** codegen related update ([#40](https://github.com/terminaldotshop/terminal-sdk-java/issues/40)) ([84e1401](https://github.com/terminaldotshop/terminal-sdk-java/commit/84e1401751b76872777ba123069e1c7763f99a9b))
* **internal:** codegen related update ([#41](https://github.com/terminaldotshop/terminal-sdk-java/issues/41)) ([5d1a222](https://github.com/terminaldotshop/terminal-sdk-java/commit/5d1a2228db595fa27b8bc12b682fd6964b70a3eb))
* **internal:** codegen related update ([#43](https://github.com/terminaldotshop/terminal-sdk-java/issues/43)) ([7d7926f](https://github.com/terminaldotshop/terminal-sdk-java/commit/7d7926f9748b919bab44171c34e81a4465b0142f))
* **internal:** codegen related update ([#44](https://github.com/terminaldotshop/terminal-sdk-java/issues/44)) ([30e70aa](https://github.com/terminaldotshop/terminal-sdk-java/commit/30e70aae20a4a30ccf5902ef90a9f8c08cc457f8))


### Documentation

* add javadoc.io badge ([#42](https://github.com/terminaldotshop/terminal-sdk-java/issues/42)) ([c95c959](https://github.com/terminaldotshop/terminal-sdk-java/commit/c95c9595428b66c3b2b7551ca9609884cd15acd3))

## 0.1.0-alpha.1 (2024-12-17)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/terminaldotshop/terminal-sdk-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** java and kotlin ([cc87e1e](https://github.com/terminaldotshop/terminal-sdk-java/commit/cc87e1e6574fac0da41d10f176e4d1b7ce6a55f9))
* **api:** manual updates ([#2](https://github.com/terminaldotshop/terminal-sdk-java/issues/2)) ([7b4ca21](https://github.com/terminaldotshop/terminal-sdk-java/commit/7b4ca21a17167345378919b099937fd61d18170f))
* **api:** manual updates ([#4](https://github.com/terminaldotshop/terminal-sdk-java/issues/4)) ([9db5d94](https://github.com/terminaldotshop/terminal-sdk-java/commit/9db5d944c758c9cf6c534fe9b88bbb2acb0b632a))
* **api:** manual updates ([#5](https://github.com/terminaldotshop/terminal-sdk-java/issues/5)) ([4016134](https://github.com/terminaldotshop/terminal-sdk-java/commit/401613454c4ba630c91784b712f5f9ddfcd01689))
* **api:** manual updates ([#6](https://github.com/terminaldotshop/terminal-sdk-java/issues/6)) ([8e674d9](https://github.com/terminaldotshop/terminal-sdk-java/commit/8e674d9178172ab30c51b6eabd7a649a5f8a0e0f))
* **api:** manual updates ([#7](https://github.com/terminaldotshop/terminal-sdk-java/issues/7)) ([b99cbdd](https://github.com/terminaldotshop/terminal-sdk-java/commit/b99cbdda316b946519024b4908eeee5884c5ec4f))
* **api:** manual updates ([#8](https://github.com/terminaldotshop/terminal-sdk-java/issues/8)) ([109e911](https://github.com/terminaldotshop/terminal-sdk-java/commit/109e911115d68ec1c2ff97db52736e61c3526086))
* **api:** manual updates ([#9](https://github.com/terminaldotshop/terminal-sdk-java/issues/9)) ([e971fb5](https://github.com/terminaldotshop/terminal-sdk-java/commit/e971fb587f4155cdd7519afa18e5f415d74cc292))
