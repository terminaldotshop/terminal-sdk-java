// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.checkRequired
import shop.terminal.api.errors.TerminalInvalidDataException

/** Variant of a product in the Terminal shop. */
class ProductVariant
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val price: JsonField<Long>,
    private val description: JsonField<String>,
    private val tags: JsonField<Tags>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
    ) : this(id, name, price, description, tags, mutableMapOf())

    /**
     * Unique object identifier. The format and length of IDs may change over time.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Name of the product variant.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Price of the product variant in cents (USD).
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): Long = price.getRequired("price")

    /**
     * Description of the product variant.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Tags for the product variant.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<Tags> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Long> = price

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductVariant].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .price()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductVariant]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var price: JsonField<Long>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<Tags> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productVariant: ProductVariant) = apply {
            id = productVariant.id
            name = productVariant.name
            price = productVariant.price
            description = productVariant.description
            tags = productVariant.tags
            additionalProperties = productVariant.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the product variant. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Price of the product variant in cents (USD). */
        fun price(price: Long) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Long>) = apply { this.price = price }

        /** Description of the product variant. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Tags for the product variant. */
        fun tags(tags: Tags) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ProductVariant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .price()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductVariant =
            ProductVariant(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("price", price),
                description,
                tags,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductVariant = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        price()
        description()
        tags().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TerminalInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.validity() ?: 0)

    /** Tags for the product variant. */
    class Tags
    private constructor(
        private val app: JsonField<String>,
        private val marketEu: JsonField<Boolean>,
        private val marketGlobal: JsonField<Boolean>,
        private val marketNa: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of(),
            @JsonProperty("market_eu")
            @ExcludeMissing
            marketEu: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("market_global")
            @ExcludeMissing
            marketGlobal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("market_na")
            @ExcludeMissing
            marketNa: JsonField<Boolean> = JsonMissing.of(),
        ) : this(app, marketEu, marketGlobal, marketNa, mutableMapOf())

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun app(): Optional<String> = app.getOptional("app")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun marketEu(): Optional<Boolean> = marketEu.getOptional("market_eu")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun marketGlobal(): Optional<Boolean> = marketGlobal.getOptional("market_global")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun marketNa(): Optional<Boolean> = marketNa.getOptional("market_na")

        /**
         * Returns the raw JSON value of [app].
         *
         * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

        /**
         * Returns the raw JSON value of [marketEu].
         *
         * Unlike [marketEu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("market_eu") @ExcludeMissing fun _marketEu(): JsonField<Boolean> = marketEu

        /**
         * Returns the raw JSON value of [marketGlobal].
         *
         * Unlike [marketGlobal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("market_global")
        @ExcludeMissing
        fun _marketGlobal(): JsonField<Boolean> = marketGlobal

        /**
         * Returns the raw JSON value of [marketNa].
         *
         * Unlike [marketNa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("market_na") @ExcludeMissing fun _marketNa(): JsonField<Boolean> = marketNa

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Tags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tags]. */
        class Builder internal constructor() {

            private var app: JsonField<String> = JsonMissing.of()
            private var marketEu: JsonField<Boolean> = JsonMissing.of()
            private var marketGlobal: JsonField<Boolean> = JsonMissing.of()
            private var marketNa: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tags: Tags) = apply {
                app = tags.app
                marketEu = tags.marketEu
                marketGlobal = tags.marketGlobal
                marketNa = tags.marketNa
                additionalProperties = tags.additionalProperties.toMutableMap()
            }

            fun app(app: String) = app(JsonField.of(app))

            /**
             * Sets [Builder.app] to an arbitrary JSON value.
             *
             * You should usually call [Builder.app] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun app(app: JsonField<String>) = apply { this.app = app }

            fun marketEu(marketEu: Boolean) = marketEu(JsonField.of(marketEu))

            /**
             * Sets [Builder.marketEu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.marketEu] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun marketEu(marketEu: JsonField<Boolean>) = apply { this.marketEu = marketEu }

            fun marketGlobal(marketGlobal: Boolean) = marketGlobal(JsonField.of(marketGlobal))

            /**
             * Sets [Builder.marketGlobal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.marketGlobal] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun marketGlobal(marketGlobal: JsonField<Boolean>) = apply {
                this.marketGlobal = marketGlobal
            }

            fun marketNa(marketNa: Boolean) = marketNa(JsonField.of(marketNa))

            /**
             * Sets [Builder.marketNa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.marketNa] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun marketNa(marketNa: JsonField<Boolean>) = apply { this.marketNa = marketNa }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Tags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tags =
                Tags(app, marketEu, marketGlobal, marketNa, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Tags = apply {
            if (validated) {
                return@apply
            }

            app()
            marketEu()
            marketGlobal()
            marketNa()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TerminalInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (app.asKnown().isPresent) 1 else 0) +
                (if (marketEu.asKnown().isPresent) 1 else 0) +
                (if (marketGlobal.asKnown().isPresent) 1 else 0) +
                (if (marketNa.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tags && app == other.app && marketEu == other.marketEu && marketGlobal == other.marketGlobal && marketNa == other.marketNa && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(app, marketEu, marketGlobal, marketNa, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tags{app=$app, marketEu=$marketEu, marketGlobal=$marketGlobal, marketNa=$marketNa, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductVariant && id == other.id && name == other.name && price == other.price && description == other.description && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, price, description, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductVariant{id=$id, name=$name, price=$price, description=$description, tags=$tags, additionalProperties=$additionalProperties}"
}
