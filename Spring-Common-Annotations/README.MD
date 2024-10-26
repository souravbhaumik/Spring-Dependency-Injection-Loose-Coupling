<body>
<h1>Spring Common Annotations</h1>
<h2>Annotations</h2>
<ul>
    <li>
        <dl>
            <dt>@Component</dt>
            <dd>Package - org.springframework.stereotype.Component</dd>
            <dd>Component annotation can be used before any java class in order to create Spring Bean. If Component name is not given, then the bean name will be same as className, with first letter as lowercase.</dd>
            <dd>Example - <b>@Component("college")</b></dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@Configuration</dt>
            <dd>Package - org.springframework.context.annotation.Configuration</dd>
            <dd>Configuration annotation used to mark a java class as a configurable class, which can be used to create object of class of the mentioned package in the mentioned class.</dd>
            <dd>Example - <b>@Configuration</b></dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@ComponentScan</dt>
            <dd>Package - org.springframework.context.annotation.ComponentScan</dd>
            <dd>ComponentScan annotation can be used along with the @Configuration annotation. Inside the mentioned package, whichever class is having @Component annotation, Spring will create object of those class only.</dd>
            <dd>Example - <b>@ComponentScan(basePackages = "com.seleniumexpress.college")</b></dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@Bean</dt>
            <dd>Package - org.springframework.context.annotation.Bean</dd>
            <dd>Bean annotation can be used along with the @Configuration annotation. This annotation simply creates the Spring bean, which is nothing but object creation inside Spring container. Bean can have multiple names for one bean. class name is the bean ID if name is not being passed in the annotation</dd>
            <dd>This works same as xml '< bean >' tag.</dd>
            <dd>Example -
                <ul>
                    <li><b>@Bean</b></li>
                    <li>@Bean(name = {"school", "schoolBean"})</li>
                </ul>
            </dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@Autowired</dt>
            <dd>Package - org.springframework.beans.factory.annotation.Autowired</dd>
            <dd>Desription - needs to be added</dd>
            <dd>Example - <b>@Autowired</b></dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@Value</dt>
            <dd>Package - org.springframework.beans.factory.annotation.Value</dd>
            <dd>Value annotation used to inject the values for literals, like integer, string etc.</dd>
            <dd>Example - <b>@Value("Selenium Express")</b></dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@Qualifier</dt>
            <dd>Package - org.springframework.beans.factory.annotation.Qualifier</dd>
            <dd>Desription - needs to be added</dd>
            <dd>Example - <b>@Qualifier("scienceTeacher")</b></dd>
        </dl>
    </li>
    <li>
        <dl>
            <dt>@Primary</dt>
            <dd>Package - org.springframework.context.annotation.Primary</dd>
            <dd>Desription - needs to be added</dd>
            <dd>Example - <b>@Primary</b></dd>
        </dl>
    </li>
</ul>
</body>
