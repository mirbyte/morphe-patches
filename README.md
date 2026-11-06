# mitrosoft Morphe Patches

Patch bundle for use with [Morphe](https://github.com/MorpheApp).

## About

Patches for apps I use.

### How to use these patches

Click the button below, or manually add this repo URL in Morphe Manager: https://github.com/mirbyte/morphe-patches

<a href="https://morphe.software/add-source?github=mirbyte/morphe-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## Patches list

<!-- PATCHES_START EXPANDED -->

<!-- Do not modify this section by hand. The patch list is generated when release.yml creates a new release.
     
     If you wish for the patches list to be collapsed, then remove the word 'EXPANDED' from the comment tag above.

     If you wish to manually keep this list updated then remove the PATCHES_START and PATCHES_END 
     comment blocks entirely. -->

#### A list of your patches will automatically be shown here after your first patches release is created.

&nbsp;

## Dev usage

- **Make all changes on the `dev` branch.**
- Local build: `./gradlew buildAndroid` → `patches/build/libs/patches-*.mpp`
- Apply locally with [Morphe Desktop](https://github.com/MorpheApp/morphe-desktop)
- Commit messages: `feat:`, `fix:`, or `chore:` (semantic commits)
- `feat:` / `fix:` create pre-releases; `chore:` does not
- Stable release: merge `dev` into `main` (merge commit, do not squash)
- Use `release.yml` for releases; do not upload releases by hand

<!-- The patches end tag is intentionally placed here so the first release will clean up 
     this readme of all developer instructions above. -->
<!-- PATCHES_END -->

### Building locally

- Run `./gradlew buildAndroid`
- The built patches `.mpp` file is in `patches/build/libs/patches-*.mpp`
- Patch with [Morphe Desktop](https://github.com/MorpheApp/morphe-desktop)

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## License

mitrosoft patches is licensed under the [GNU General Public License v3.0](LICENSE)
