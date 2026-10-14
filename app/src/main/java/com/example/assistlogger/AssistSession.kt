package com.example.assistlogger


import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Bitmap
import android.service.voice.VoiceInteractionSession
import android.util.Log

class AssistSession(context: Context) : VoiceInteractionSession(context) {

    companion object {
        const val LOG_TAG = "AssistSession"
    }

    override fun onCreate() {
        Log.d(LOG_TAG, "onCreate")
        super.onCreate()
    }

    override fun onDestroy() {
        Log.d(LOG_TAG, "onDestroy")
        super.onDestroy()
    }


    // Assist methods

    override fun onHandleAssist(state: AssistState) {
        Log.d(LOG_TAG, "onHandleAssist($state): assistStructure ${state.assistStructure}; assistContent${state.assistContent}")
    }

    override fun onHandleScreenshot(screenshot: Bitmap?) {
        Log.d(LOG_TAG, "onHandleScreenshot($screenshot)")
    }

    override fun onAssistStructureFailure(failure: Throwable?) {
        Log.d(LOG_TAG, "onAssistStructureFailure")
        super.onAssistStructureFailure(failure)
    }

    override fun onRequestCommand(request: CommandRequest?) {
        Log.d(LOG_TAG, "onRequestCommand")
        super.onRequestCommand(request)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.d(LOG_TAG, "onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }

    override fun onDirectActionsInvalidated(activityId: ActivityId) {
        Log.d(LOG_TAG, "onDirectActionsInvalidated")
        super.onDirectActionsInvalidated(activityId)
    }

    override fun onGetSupportedCommands(commands: Array<out String?>?): BooleanArray? {
        Log.d(LOG_TAG, "onGetSupportedCommands")
        return super.onGetSupportedCommands(commands)
    }

    override fun onRequestAbortVoice(request: AbortVoiceRequest?) {
        Log.d(LOG_TAG, "onRequestAbortVoice")
        super.onRequestAbortVoice(request)
    }

    override fun onRequestCompleteVoice(request: CompleteVoiceRequest?) {
        Log.d(LOG_TAG, "onRequestCompleteVoice")
        super.onRequestCompleteVoice(request)
    }

    override fun onRequestConfirmation(request: ConfirmationRequest?) {
        Log.d(LOG_TAG, "onRequestConfirmation")
        super.onRequestConfirmation(request)
    }

    override fun onRequestPickOption(request: PickOptionRequest?) {
        Log.d(LOG_TAG, "onRequestPickOption")
        super.onRequestPickOption(request)
    }

    override fun onTaskFinished(intent: Intent?, taskId: Int) {
        Log.d(LOG_TAG, "onTaskFinished")
        super.onTaskFinished(intent, taskId)
    }

    override fun onTaskStarted(intent: Intent?, taskId: Int) {
        Log.d(LOG_TAG, "onTaskStarted")
        super.onTaskStarted(intent, taskId)
    }

    override fun onCancelRequest(request: Request?) {
        Log.d(LOG_TAG, "onCancelRequest")
        super.onCancelRequest(request)
    }

}
