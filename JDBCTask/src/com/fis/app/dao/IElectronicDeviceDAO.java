package com.fis.app.dao;

import java.util.List;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectrnoicDevice;

public interface IElectronicDeviceDAO {

	
	public boolean addDevice(ElectrnoicDevice device);
	public List<ElectrnoicDevice> getAllDevices();
	
	public ElectrnoicDevice changeDevicePrice(int deviceId,int newPrice)throws NoDeviceFoundException;
	public ElectrnoicDevice changeDeviceRating(int deviceId,int newRating)throws NoDeviceFoundException;
	
	public boolean deleteDevice(int deviceId)throws NoDeviceFoundException;
	
	public List<ElectrnoicDevice> geDevicesBasedOnBrandNameAndType(String brandName,String type);
	public int countDeviceType(String type);
	public List getSumofPriceBasedOnType(String type);
	
	
	
}
