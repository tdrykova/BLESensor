package com.tatry.blesensor.presentation

import android.bluetooth.BluetoothAdapter
import androidx.compose.runtime.Composable
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.tatry.blesensor.presentation.permissions.SystemBroadcastReceiver

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun TemperatureHumidityScreen(
    onBluetoothStateChanged:()->Unit,
) {

    SystemBroadcastReceiver(systemAction = BluetoothAdapter.ACTION_STATE_CHANGED){ bluetoothState ->
        val action = bluetoothState?.action ?: return@SystemBroadcastReceiver
        if(action == BluetoothAdapter.ACTION_STATE_CHANGED){
            onBluetoothStateChanged()
        }
    }
}