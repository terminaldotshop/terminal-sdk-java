// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.subscription.SubscriptionCreateParams
import shop.terminal.api.models.subscription.SubscriptionCreateResponse
import shop.terminal.api.models.subscription.SubscriptionDeleteParams
import shop.terminal.api.models.subscription.SubscriptionDeleteResponse
import shop.terminal.api.models.subscription.SubscriptionGetParams
import shop.terminal.api.models.subscription.SubscriptionGetResponse
import shop.terminal.api.models.subscription.SubscriptionListParams
import shop.terminal.api.models.subscription.SubscriptionListResponse
import shop.terminal.api.models.subscription.SubscriptionUpdateParams
import shop.terminal.api.models.subscription.SubscriptionUpdateResponse

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    /** Create a subscription for the current user. */
    fun create(): CompletableFuture<SubscriptionCreateResponse> =
        create(SubscriptionCreateParams.none())

    /** @see [create] */
    fun create(
        params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionCreateResponse>

    /** @see [create] */
    fun create(
        params: SubscriptionCreateParams = SubscriptionCreateParams.none()
    ): CompletableFuture<SubscriptionCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<SubscriptionCreateResponse> =
        create(SubscriptionCreateParams.none(), requestOptions)

    /** Update card, address, or interval for an existing subscription. */
    fun update(id: String): CompletableFuture<SubscriptionUpdateResponse> =
        update(id, SubscriptionUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
    ): CompletableFuture<SubscriptionUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionUpdateResponse>

    /** @see [update] */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<SubscriptionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionUpdateResponse> =
        update(id, SubscriptionUpdateParams.none(), requestOptions)

    /** List the subscriptions associated with the current user. */
    fun list(): CompletableFuture<SubscriptionListResponse> = list(SubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see [list] */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<SubscriptionListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubscriptionListResponse> =
        list(SubscriptionListParams.none(), requestOptions)

    /** Cancel a subscription for the current user. */
    fun delete(id: String): CompletableFuture<SubscriptionDeleteResponse> =
        delete(id, SubscriptionDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ): CompletableFuture<SubscriptionDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionDeleteResponse>

    /** @see [delete] */
    fun delete(params: SubscriptionDeleteParams): CompletableFuture<SubscriptionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionDeleteResponse> =
        delete(id, SubscriptionDeleteParams.none(), requestOptions)

    /** Get the subscription with the given ID. */
    fun get(id: String): CompletableFuture<SubscriptionGetResponse> =
        get(id, SubscriptionGetParams.none())

    /** @see [get] */
    fun get(
        id: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        id: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
    ): CompletableFuture<SubscriptionGetResponse> = get(id, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionGetResponse>

    /** @see [get] */
    fun get(params: SubscriptionGetParams): CompletableFuture<SubscriptionGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionGetResponse> =
        get(id, SubscriptionGetParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /subscription`, but is otherwise the same as
         * [SubscriptionServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>> =
            create(SubscriptionCreateParams.none())

        /** @see [create] */
        fun create(
            params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>>

        /** @see [create] */
        fun create(
            params: SubscriptionCreateParams = SubscriptionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>> =
            create(SubscriptionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /subscription/{id}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<SubscriptionUpdateResponse>> =
            update(id, SubscriptionUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionUpdateResponse>>

        /** @see [update] */
        fun update(
            params: SubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionUpdateResponse>> =
            update(id, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription`, but is otherwise the same as
         * [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(SubscriptionListParams.none())

        /** @see [list] */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see [list] */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /subscription/{id}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<SubscriptionDeleteResponse>> =
            delete(id, SubscriptionDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: SubscriptionDeleteParams
        ): CompletableFuture<HttpResponseFor<SubscriptionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionDeleteResponse>> =
            delete(id, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription/{id}`, but is otherwise the same as
         * [SubscriptionServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SubscriptionGetResponse>> =
            get(id, SubscriptionGetParams.none())

        /** @see [get] */
        fun get(
            id: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        fun get(
            id: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionGetResponse>>

        /** @see [get] */
        fun get(
            params: SubscriptionGetParams
        ): CompletableFuture<HttpResponseFor<SubscriptionGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionGetResponse>> =
            get(id, SubscriptionGetParams.none(), requestOptions)
    }
}
