package app.mitrosoft.patches.bergfex

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * ProStatusResolver.resolve (xce.c): maps license type to Free (tce.a) / Lifetime (tce.b) / Subscription (tce.c).
 * Obfuscated names are pinned to Bergfex Tours 4.56.1.
 */
object ResolveProStatusFingerprint : Fingerprint(
    definingClass = "Lxce;",
    name = "c",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Ltce;",
    parameters = listOf("Lmq9;", "Ltce;"),
)
