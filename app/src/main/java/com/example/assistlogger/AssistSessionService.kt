package com.example.assistlogger

import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import android.service.voice.VoiceInteractionSessionService
import android.util.Log


class AssistSessionService : VoiceInteractionSessionService() {

    companion object {
        const val LOG_TAG = "AssistSessionService"
    }

    override fun onNewSession(bundle: Bundle?): VoiceInteractionSession {
        Log.d(LOG_TAG, "onNewSession")

        return AssistSession(this.applicationContext)
    }
}