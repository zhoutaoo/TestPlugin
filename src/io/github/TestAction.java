package io.github;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.Messages;

public class TestAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent aae) {
        Project project = aae.getProject();
        //弹出气泡提示
        NotificationGroup notificationGroup = NotificationGroupManager.getInstance().getNotificationGroup("AllNotification");
        Notification notification = notificationGroup.createNotification("测试测试", MessageType.INFO);
        Notifications.Bus.notify(notification);
        //显示窗口
        new TestPluginDialog().showMe();
        //提示tips
        Messages.showInfoMessage(project, "测试消息", "Tips");
    }
}
