package com.neo.hello;

import com.neo.hello.comm.NeoProperties;
import com.neo.hello.comm.OtherProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${neo.hello.title}")
    private String title;
    @Resource
    private NeoProperties properties;
    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testSingle(){
        Assert.assertEquals(title, "Zhou Haiming");
//        System.out.println("title "+ title);
    }

    @Test
    public void testMore() throws Exception{
        System.out.println("title:"+ properties.getTitle());
        System.out.println("description:"+properties.getDescription());
    }

    @Test
    public void testOther() throws Exception{
        System.out.println("title:"+ otherProperties.getTitle());
        System.out.println("blog:"+otherProperties.getBlog());
    }
}
