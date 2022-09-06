# 笔记

- 面向对象编程
    - 契约接口
        - Aware
            - BeanNameAware: 可以注入 beanName
            - ApplicationContextAware: 可以获取容器上下文
        - BeanPostProcessor
            - postProcessBeforeInitialization: 在 bean 被 init 之前调用
            - postProcessAfterInitialization: 在 bean 被 init 之后调用
        - bean 初始化(init)操作
            - @PostConstruct，在 setter 注入和 字段注入之后被调用
            - InitializingBean.afterPropertiesSet
- IoC
    - DI
        - 构造器注入: 不需要 @Autowired 注解，用于必须的组件
        - setter 注入: 需要 @Autowired 注解，如果组件不一定存在，可以在 @Autowired 中加入参数 `required = false`, 如果组件不存在，则对应的 setter 方法不被调用
        - 字段注入: 需要 @Autowired 注解，可以添加 `required = false`