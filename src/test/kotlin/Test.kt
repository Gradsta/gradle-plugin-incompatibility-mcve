import io.kotest.core.spec.style.FunSpec
import io.kotest.engine.spec.tempdir
import io.kotest.matchers.shouldBe
import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.TaskOutcome
import java.io.File

class Test : FunSpec({

    val tempDir = tempdir()
    val settingsFile = File(tempDir.path, "settings.gradle.kts")
    val buildFile = File(tempDir.path, "build.gradle.kts")

    beforeTest {
        settingsFile.writeText(
            """
                rootProject.name = "test"
            """.trimIndent()
        )
    }

    test("build is successful") {
        buildFile.writeText(
            """
                plugins {
                    id("test")
                }
            """.trimIndent()
        )

        val result = GradleRunner.create()
            .withProjectDir(tempDir)
            .withArguments("build")
            .withPluginClasspath()
            .build()

        result.task(":build")?.outcome shouldBe TaskOutcome.SUCCESS
    }
})