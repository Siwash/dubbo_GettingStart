package rpf.dubbo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import rpf.dubbo.service.DubboStartService;

public class DubboStartServiceImpl implements DubboStartService {

	public List<String> MyfirstDistributedService(String id) {
		List<String> result =new ArrayList<String>();
		result.add(id+"0x001");
		result.add(id+"0x002");
		result.add(id+"0x003");
		return result;
	}

}
