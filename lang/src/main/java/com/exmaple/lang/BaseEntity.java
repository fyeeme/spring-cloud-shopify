package com.exmaple.lang;

import java.time.Instant;

/**
 * 实体基类,由于我们使用了MBG,因此 通用基类字段提取意义不大，建议直接实现 Entity
 * 如果业务上没有特殊的逻辑处理，也可以直接实现Serializable，
 * <p>
 * 这里我们 Entity 为了可能用到 AspectJ等切面判断
 */

@SuppressWarnings("serial")
@Deprecated
public class BaseEntity implements Entity {

    private Long id;

    private Instant createTime;

    private Instant updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }
}
