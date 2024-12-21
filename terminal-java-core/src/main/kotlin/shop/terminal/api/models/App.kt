// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

/** A Terminal App used for configuring an OAuth 2.0 client. */
@NoAutoDetect
class App
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("redirectURI")
    @ExcludeMissing
    private val redirectUri: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Name of the app. */
    fun name(): String = name.getRequired("name")

    /** Redirect URI of the app. */
    fun redirectUri(): String = redirectUri.getRequired("redirectURI")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Name of the app. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Redirect URI of the app. */
    @JsonProperty("redirectURI") @ExcludeMissing fun _redirectUri() = redirectUri

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): App = apply {
        if (!validated) {
            id()
            name()
            redirectUri()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var redirectUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(app: App) = apply {
            id = app.id
            name = app.name
            redirectUri = app.redirectUri
            additionalProperties = app.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the app. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the app. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Redirect URI of the app. */
        fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

        /** Redirect URI of the app. */
        fun redirectUri(redirectUri: JsonField<String>) = apply { this.redirectUri = redirectUri }

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

        fun build(): App =
            App(
                id,
                name,
                redirectUri,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is App && id == other.id && name == other.name && redirectUri == other.redirectUri && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, redirectUri, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "App{id=$id, name=$name, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
}