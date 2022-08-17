/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package string.compression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AppTest {
    @Test void givenStringWithDifferentCharactersShouldCompress() {
        var sc = new StringCompression();
        var input = "aabccccccaa";
        var expectedOutput = "a2b1c5a2";

        assertThat(sc.compress(input)).isEqualTo(expectedOutput);
    }
}
