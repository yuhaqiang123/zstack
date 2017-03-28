package org.zstack.core.notification;

import org.springframework.http.HttpMethod;
import org.zstack.header.query.APIQueryMessage;
import org.zstack.header.query.AutoQuery;
import org.zstack.header.rest.RestRequest;

/**
 * Created by xing5 on 2017/3/18.
 */
@RestRequest(
        path = "/notifications/subscriptions",
        optionalPaths = {"/notifications/subscriptions/{uuid}"},
        method = HttpMethod.GET,
        responseClass = APIQueryNotificationSubscriptionReply.class
)
@AutoQuery(replyClass = APIQueryNotificationSubscriptionReply.class, inventoryClass = NotificationSubscriptionInventory.class)
public class APIQueryNotificationSubscriptionMsg extends APIQueryMessage {
}