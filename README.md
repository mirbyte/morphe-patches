# mitrosoft Morphe Patches

Patch bundle for use with [Morphe](https://github.com/MorpheApp).

## About

Still trying to figure this out. Patches are always tested on my own devices before releasing.

### How to use these patches

Click the button below, or manually add this repo URL in Morphe Manager: https://github.com/mirbyte/morphe-patches

<a href="https://morphe.software/add-source?github=mirbyte/morphe-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.1](https://github.com/mirbyte/morphe-patches/releases/tag/v1.0.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 TradingView&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**Package name:** `com.tradingview.tradingviewapp`

**🎯 Supported versions:**

| 1.20.86.0.1002565 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Hide profile upsell banner](#hide-profile-upsell-banner) | Hides the subscription upsell banner below the profile on the Menu tab. |  |

</details>

<!-- PATCHES_END -->

### Building locally

- Run `./gradlew buildAndroid`
- The built patches `.mpp` file is in `patches/build/libs/patches-*.mpp`
- Patch with [Morphe Desktop](https://github.com/MorpheApp/morphe-desktop)

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## License

mitrosoft patches is licensed under the [GNU General Public License v3.0](LICENSE)
