package com.youguu.open.rpc.server.impl;

import com.alibaba.fastjson.JSON;
import com.youguu.core.util.ClassCast;
import com.youguu.open.common.constants.Constants;
import com.youguu.open.common.pojo.IdentityInfo;
import com.youguu.open.common.pojo.OpenBaseInfo;
import com.youguu.open.common.pojo.OpenCounterSetting;
import com.youguu.open.common.pojo.PaperAnswer;
import com.youguu.open.common.thrift.*;
import com.youguu.open.server.service.IIdCardService;
import com.youguu.open.server.service.IOpenCounterSettingService;
import com.youguu.open.server.service.impl.CaiRenHuiOpenServiceImpl;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * Created by shilei on 2015/8/12.
 */
@Service("realOpenThriftRpcService")
public class OpenThriftRpcServiceImpl implements RealOpenThriftRpcService.Iface {


}
