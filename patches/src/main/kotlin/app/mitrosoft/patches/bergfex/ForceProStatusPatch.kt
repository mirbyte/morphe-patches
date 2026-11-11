package app.mitrosoft.patches.bergfex

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.mitrosoft.patches.shared.Constants.COMPATIBILITY_BERGFEX

@Suppress("unused")
val forceProStatusPatch = bytecodePatch(
    name = "Force Pro status",
    description = "Forces the license status to Lifetime (Pro) for all users.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_BERGFEX)

    execute {
        // Same early return as patch_bergfex_pro.py: always tce.b (Lifetime).
        ResolveProStatusFingerprint.method.addInstructions(
            0,
            """
                sget-object p0, Ltce;->b:Ltce;
                return-object p0
            """,
        )
    }
}
