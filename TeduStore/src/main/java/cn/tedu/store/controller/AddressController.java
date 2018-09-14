package cn.tedu.store.controller;

import cn.tedu.store.bean.Address;
import cn.tedu.store.bean.ResponseResult;
import cn.tedu.store.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController extends BeanController {
    @Resource
    private AddressService addressService;

    //跳转到收货人页面
    @RequestMapping("/showAddress.do")
    public String showAddress() {
        return "addressAdmin";
    }

    //发送异步请求，添加收货人信息
    @RequestMapping("/addAddress.do")
    @ResponseBody
    public ResponseResult<Void> addAddress(
            HttpSession session,
            @RequestParam("receiverName") String recvName,
            @RequestParam("receiverState") String recvProvince,
            @RequestParam("receiverCity") String recvCity,
            @RequestParam("receiverDistrict") String recvArea,
            @RequestParam("receiverAddress") String recvAddress,
            @RequestParam("receiverMobile") String recvPhone,
            @RequestParam("receiverPhone") String recvTel,
            @RequestParam("receiverZip") String recvZip,
            @RequestParam("addressName") String recvTag
    ) {
        ResponseResult<Void> rr = null;
        Address address = new Address();
        try {
            address.setuId(this.getId(session));
            address.setRecvName(recvName);
            address.setRecvProvince(recvProvince);
            address.setRecvCity(recvCity);
            address.setRecvArea(recvArea);
            address.setRecvAddress(recvAddress);
            address.setRecvPhone(recvPhone);
            address.setRecvTel(recvTel);
            address.setRecvZip(recvZip);
            address.setRecvTag(recvTag);
            addressService.addAddress(address);
            rr = new ResponseResult<Void>(1,"收货人添加成功");
        }catch (RuntimeException e){
            rr = new ResponseResult<Void>(0,"收货人添加失败");
        }
        return rr;
    }

    //发送异步请求，显示收货人信息
    @RequestMapping("/getByUid.do")
    @ResponseBody
    public ResponseResult<List<Address>> getByUid(
            HttpSession session
    ){
        ResponseResult<List<Address>> rr =
                new ResponseResult<List<Address>>(1,"成功");
        List<Address> list =
                addressService.getByUid(this.getId(session));
        rr.setData(list);
        return rr;
    }

    @RequestMapping("/setDefault.do")
    @ResponseBody
    public ResponseResult<Void> setDefault(HttpSession session,Integer id){
        //声明rr对象
        ResponseResult<Void> rr = null;
        try {
            addressService.setDefault(this.getId(session),id);
            rr = new ResponseResult<Void>(1,"设置成功");
        }catch (RuntimeException e){
            //发送错误信息
            rr = new ResponseResult<Void>(0,e.getMessage());
        }
        return rr;
    }

    @RequestMapping("/goUpdate.do")
    @ResponseBody
    public ResponseResult<Address> goUpdate(Integer id){
        ResponseResult<Address> rr = new ResponseResult<Address>(1,"成功");
        Address address = addressService.getById(id);
        rr.setData(address);
        return rr;
    }

    @RequestMapping("/updateAddress.do")
    @ResponseBody
    public ResponseResult<Void> updateAddress(
            Integer id,
            String recvName,String recvProvince,String recvCity,
            String recvArea,String recvAddress,String recvPhone,
            String recvTel,String recvZip,String recvTag
    ){
        ResponseResult<Void> rr = new ResponseResult<Void>(1,"成功");
        Address address = new Address();
        address.setId(id);
        address.setRecvName(recvName);
        address.setRecvProvince(recvProvince);
        address.setRecvCity(recvCity);
        address.setRecvArea(recvArea);
        address.setRecvAddress(recvAddress);
        address.setRecvPhone(recvPhone);
        address.setRecvTel(recvTel);
        address.setRecvZip(recvZip);
        address.setRecvTag(recvTag);
        addressService.addAddress(address);
        return rr;
    }
}
