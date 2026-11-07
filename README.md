# mitrosoft Morphe

Patch bundle for use with [Morphe](https://github.com/MorpheApp).

## About

Still trying to figure this out.

Exhaustive testing has not been done. Please report any issues.

### How to use these patches

Click the button below, or manually add this repo URL in Morphe Manager: https://github.com/mirbyte/morphe-patches

<a href="https://morphe.software/add-source?github=mirbyte/morphe-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.1.0-dev.1](https://github.com/mirbyte/morphe-patches/releases/tag/v1.1.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;6 patches total
<details open>
<summary>📦 TradingView&nbsp;&nbsp;•&nbsp;&nbsp;6 patches</summary>
<br>

**Package name:** `com.tradingview.tradingviewapp`

**🎯 Supported versions:**

| 1.20.86.0.1002565 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable AdMob](#disable-admob) | Makes the AdMob availability check return false. |  |
| [Disable GoPro ad fallback](#disable-gopro-ad-fallback) | Disables the GoPro promo fallback triggered by AdMob load failures. |  |
| [Disable analytics](#disable-analytics) | Drops analytics, tracking, and funnel events. |  |
| [Force local Pro plan](#force-local-pro-plan) | Forces the local plan lookup and plan state to report Pro. Also hides the profile upsell banner. |  |
| [Hide profile upsell banner](#hide-profile-upsell-banner) | Hides the subscription upsell banner below the profile on the Menu tab. Also hidden by Force local Pro plan. |  |
| [Holy larp](#holy-larp) | Forces the Ultimate badge on the current user. Visual only. |  |

</details>

<!-- PATCHES_END -->

### Building locally

- Run `./gradlew buildAndroid`
- The built patches `.mpp` file is in `patches/build/libs/patches-*.mpp`
- Patch with [Morphe Desktop](https://github.com/MorpheApp/morphe-desktop)

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## License

mitrosoft Morphe is licensed under the [GNU General Public License v3.0](LICENSE)
