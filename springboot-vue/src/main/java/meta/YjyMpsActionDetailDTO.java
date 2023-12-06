package meta;

import lombok.Data;
import meta.dto.YjyActionContactDTO;
import meta.dto.YjyActionNewMemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: tmind
 * @Date: 2023/11/17 11:29
 * @Description:
 */
@Data
public class YjyMpsActionDetailDTO {
    private String conversationId;
    private String type;
    private String name;
    private String groupNickName;
    private String robotKey;
    private ArrayList<String> quitedUserIds;
    private String quitType;
    private List<YjyActionNewMemberDTO> newMembers;
    private List<String> reqContacts;
    private List<YjyActionContactDTO> contacts;
    private Map<String, String> usersData;
    private String sendTime;
    private String routing;
    private long statUpRecv;
    private long statUpSend;
    private int robotType;
    private int robotBizType;
    private String assignTo;
    private long dts;
    private String nodeServerCode;
    private String code;
    private String siteCode;
    private int bizType;
    private String messageId;
    private int sendTimeTs;
    private String chatroom;
}
