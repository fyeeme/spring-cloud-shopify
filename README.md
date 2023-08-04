## 1. 代码规范

### 1.1 Service/Mapper 

在方法命名中，一般使用动词+名词的方式来描述该方法的作用， 同时在方法命名时，也需要注意以下几点：
1. 名称要简单易懂，能够直观表达出方法的作用
2. 尽量使用常见的单词和表达式，方便其他开发人员理解
3. 遵循团队内部的规范，保持代码风格统一

参考 Spring data JPA 规范，通用接口设计如下

```text 
insert
update 
findById
findByQuery
findAll/findAllForPage/queryForPage
findList/queryForList
```
```text
编辑 
insert(Entity entity)
update(Entity entity)
batchInsert(List<Entity> entities)
batchUpdate(List<Entity> entities)
---
单个查询
findById(Long id)
findByUserIdAndStatus(Long userId, Integer status)
findByQuery(EntityQuery entityQuery) //三个或以上参数
--- 
list/分页
findPage(EntityPageQuery entityPageQuery)
findList(EntityQuery entityQuery)
---
删除
delete(Entity entity)
deleteById(Long id)
deleteAllById(List<Long> ids)

---
其他
enroll(Entity entity)
checkUserName(Long id, String userName)
disable(Entity entity)
enable(Entity entity)
existById(Long id)
publish(Entity entity)
undoPublish(Entity entity)
```

## 2. restful 最佳实践

使用 请求方法表示操作动作

| HTTP Verb | /customers | /customers/{id} |
|-----------|------------|-----------------|
| GET       | 查询客户列表、分页等 | 查询单个用户数据        |
| PUT       | 404        | 更新用户            |
| POST      | 创建用户       | 404             |

[//]: # (| DELETE    | 404        | 删除用户            |)