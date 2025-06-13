// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.address.AddressCreateParams
import shop.terminal.api.models.address.AddressCreateResponse
import shop.terminal.api.models.address.AddressDeleteParams
import shop.terminal.api.models.address.AddressDeleteResponse
import shop.terminal.api.models.address.AddressGetParams
import shop.terminal.api.models.address.AddressGetResponse
import shop.terminal.api.models.address.AddressListParams
import shop.terminal.api.models.address.AddressListResponse

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressServiceAsync

    /** Create and add a shipping address to the current user. */
    fun create(params: AddressCreateParams): CompletableFuture<AddressCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressCreateResponse>

    /** Get the shipping addresses associated with the current user. */
    fun list(): CompletableFuture<AddressListResponse> = list(AddressListParams.none())

    /** @see [list] */
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressListResponse>

    /** @see [list] */
    fun list(
        params: AddressListParams = AddressListParams.none()
    ): CompletableFuture<AddressListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AddressListResponse> =
        list(AddressListParams.none(), requestOptions)

    /** Delete a shipping address from the current user. */
    fun delete(id: String): CompletableFuture<AddressDeleteResponse> =
        delete(id, AddressDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
    ): CompletableFuture<AddressDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressDeleteResponse>

    /** @see [delete] */
    fun delete(params: AddressDeleteParams): CompletableFuture<AddressDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressDeleteResponse> =
        delete(id, AddressDeleteParams.none(), requestOptions)

    /** Get the shipping address with the given ID. */
    fun get(id: String): CompletableFuture<AddressGetResponse> = get(id, AddressGetParams.none())

    /** @see [get] */
    fun get(
        id: String,
        params: AddressGetParams = AddressGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        id: String,
        params: AddressGetParams = AddressGetParams.none(),
    ): CompletableFuture<AddressGetResponse> = get(id, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: AddressGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressGetResponse>

    /** @see [get] */
    fun get(params: AddressGetParams): CompletableFuture<AddressGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<AddressGetResponse> =
        get(id, AddressGetParams.none(), requestOptions)

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /address`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        fun create(
            params: AddressCreateParams
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none())

        /** @see [list] */
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressListResponse>>

        /** @see [list] */
        fun list(
            params: AddressListParams = AddressListParams.none()
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /address/{id}`, but is otherwise the same as
         * [AddressServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(id, AddressDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: AddressDeleteParams
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(id, AddressDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /address/{id}`, but is otherwise the same as
         * [AddressServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<AddressGetResponse>> =
            get(id, AddressGetParams.none())

        /** @see [get] */
        fun get(
            id: String,
            params: AddressGetParams = AddressGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        fun get(
            id: String,
            params: AddressGetParams = AddressGetParams.none(),
        ): CompletableFuture<HttpResponseFor<AddressGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: AddressGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressGetResponse>>

        /** @see [get] */
        fun get(params: AddressGetParams): CompletableFuture<HttpResponseFor<AddressGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressGetResponse>> =
            get(id, AddressGetParams.none(), requestOptions)
    }
}
