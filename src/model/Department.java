package model;

public class Department {
    private String deptCode;
    private String deptName;
    private String deptCategoryID;
    private String deptType;

    public Department(String deptCode, String deptName, String deptCategoryID, String deptType) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.deptCategoryID = deptCategoryID;
        this.deptType = deptType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCategoryID() {
        return deptCategoryID;
    }

    public void setDeptCategoryID(String deptCategoryID) {
        this.deptCategoryID = deptCategoryID;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }
}

// 类名全部首字母大写，按住shift+f6改名，idea能够自动修改所有这个类/方法/变量出现过的地方，比如说.
// 我把首字母改成大写，只需要直接改这个类的类名
// 看，这里也更恨着改了

// 问题挺多的，（（（(；′⌒`)白白现在改一下database的名试试
// okk

// 所有git的操作，在IDEA里都能用图形界面实现，比如说，刚刚我们通过share project on github在github上开了一个新的仓库
// git的原理是，监控文件的所有改动。为了指定git要监控哪些文件，我们需要用git add把文件加进监控列表里，比如说我新建一个类
// IDEA会自动蹦出来问你要不要把新建的文件加进监控列表里

// 然后，git记录下所有的改动之后，这些改动其实还是处于暂存区，没有正式形成一个版本，为了把暂存区里的所有改动保存成一个版本，需要用git commit

// 哈哈哈哈哈，慢慢改吧，我接着说
//
// ！不要说了我肚子疼、啊需要解决一下吗？？解决个鬼鬼头？？好嘛？你想怎么解决啊0.0我又没有止痛药(；′⌒`)俺下一时以为是好了不用说了变态！？你想说啥
// ananan安详继续演示的说 我肚子疼！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！死了！wuwu1!!w1u1!1u!1u!w!1u1wuwu!wuwuwuwuwuuwuwuwuwuhawoodomaum我都没哭你哭啥疼的又不是你！！！疼在我心呜呜呜那你还想继续讲/快哭了/
//你想说啥，呜呜白白先缓一缓换个鬼鬼头不应该早点休息嘛 ！Y动物id额对我的呃！！！、读、【表情】  ？？你在打uiI噶的呢么啊 对的！！！！！！声波仪表我？？明白白白要早点睡！对啊我要上床了我还没洗衣服呢sigh呜呜呜嗯嗯，

// 说完了git commit，接下来要说git push。
// 其实git push不是必需的，因为git commit已经把改动提交了。但是这些改动仍旧存在本地。
// git push的作用，顾名思义，就是把本地提交了的版本 推送 到云端