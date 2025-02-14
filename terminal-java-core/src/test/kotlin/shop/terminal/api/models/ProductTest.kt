// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.JsonValue

class ProductTest {

    @Test
    fun createProduct() {
        val product =
            Product.builder()
                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .description(
                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                )
                .addFilter(Product.Filter.EU)
                .name("[object Object]")
                .addVariant(
                    ProductVariant.builder()
                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("12oz")
                        .price(2200L)
                        .build()
                )
                .order(100L)
                .subscription(Product.Subscription.ALLOWED)
                .tags(
                    Product.Tags.builder()
                        .putAdditionalProperty("featured", JsonValue.from("true"))
                        .build()
                )
                .build()
        assertThat(product).isNotNull
        assertThat(product.id()).isEqualTo("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(product.description())
            .isEqualTo(
                "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
            )
        assertThat(product.filters()).containsExactly(Product.Filter.EU)
        assertThat(product.name()).isEqualTo("[object Object]")
        assertThat(product.variants())
            .containsExactly(
                ProductVariant.builder()
                    .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("12oz")
                    .price(2200L)
                    .build()
            )
        assertThat(product.order()).contains(100L)
        assertThat(product.subscription()).contains(Product.Subscription.ALLOWED)
        assertThat(product.tags())
            .contains(
                Product.Tags.builder()
                    .putAdditionalProperty("featured", JsonValue.from("true"))
                    .build()
            )
    }
}
