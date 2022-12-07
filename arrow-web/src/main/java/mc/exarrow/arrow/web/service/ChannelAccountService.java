package mc.exarrow.arrow.web.service;


import mc.exarrow.arrow.support.domain.ChannelAccount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 渠道接口
 */

public interface ChannelAccountService {

    /**
     * 保存/修改渠道账号信息
     * @param channelAccount
     * @return
     */
    ChannelAccount save(ChannelAccount channelAccount);


    /**
     * 获取渠道账号列表信息
     * @return
     */
    List<ChannelAccount> list();
}
