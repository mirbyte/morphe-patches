package app.mitrosoft.patches.tradingview

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * GoProBannersInteractorImpl.getProfileBanner: profile menu upsell banner ("Supercharge your trading").
 * Callers: MenuProfileInteractorImpl.profileBannerFlow.
 */
object GetProfileBannerFingerprint : Fingerprint(
    definingClass = "Lcom/tradingview/tradingviewapp/gopro/impl/core/interactor/GoProBannersInteractorImpl;",
    name = "getProfileBanner",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Ljava/lang/Object;",
    parameters = listOf("Lkotlin/coroutines/Continuation;"),
)
