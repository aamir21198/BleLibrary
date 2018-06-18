package com.spectrum.ble;

import android.bluetooth.BluetoothGattService;

import java.util.List;

public interface GattListener {

    public void onDeviceConnected();

    public void onDeviceDisconnected();

    public void onServiceDiscovered(List<BluetoothGattService> services);

    public void onAdvDataDiscovered(byte[] characteristic, String data);
}
