package com.baeldung.um.test.live;

import com.baeldung.common.interfaces.IDto;
import com.baeldung.test.common.web.AbstractDiscoverabilityLiveTest;
import com.baeldung.um.spring.CommonTestConfig;
import com.baeldung.um.spring.UmClientConfig;
import com.baeldung.um.spring.UmLiveTestConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmLiveTestConfig.class, UmClientConfig.class, CommonTestConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class UmDiscoverabilityRestLiveTest<T extends IDto> extends AbstractDiscoverabilityLiveTest<T> {

    public UmDiscoverabilityRestLiveTest(final Class<T> clazzToSet) {
        super(clazzToSet);
    }

}