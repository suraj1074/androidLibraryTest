package com.example.cloudmessagelibrary;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "Message: " + remoteMessage.getMessageId());
    }

    @Override
    public void onNewToken(String token) {

        Log.d(TAG, "Refreshed token: " + token);
    }
}
