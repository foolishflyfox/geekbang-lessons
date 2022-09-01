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
            - @PostConstruct
            - InitializingBean.afterPropertiesSet