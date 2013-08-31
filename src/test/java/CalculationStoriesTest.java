import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import my.apps.calculator.CalculationSteps;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitReportingRunner.class)
public class CalculationStoriesTest extends JUnitStories {

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(new MostUsefulConfiguration(), new CalculationSteps());
    }

    @Override
    protected List<String> storyPaths() {
        // デフォルト設定ではクラスパスから検索する。
        return Arrays.asList("calculation.story");
    }
}
