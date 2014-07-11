package com.example.pushimpdemo;

import com.example.pushimpdemo.controller.NotificationHandler;
import com.example.pushimpdemo.controller.SMSHandler;
import com.example.pushimpdemo.controller.ToastHandler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DemoReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if(intent != null){
			//����֪ͨ��
			NotificationHandler.handle(context, intent);
			//�������
			SMSHandler.handle(context, intent);
			//Toast����
			ToastHandler.handle(context, intent);
		}
	}

}
