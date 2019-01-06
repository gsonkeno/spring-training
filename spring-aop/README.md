## soring-aop训练
spring源码核心类、方法如下
- AopNamespaceHandler.init()
- AspectJAutoProxyBeanDefinitionParser.parse(Element element, ParserContext parserContext)
- AopNamespaceUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(ParserContext parserContext, Element sourceElement)
- AbstractAutoProxyCreator.postProcessAfterInitialization(Object bean, String beanName)
- AbstractAutoProxyCreator.wrapIfNecessary(Object bean, String beanName, Object cacheKey)
- DefaultAopProxyFactory.createAopProxy(AdvisedSupport config)