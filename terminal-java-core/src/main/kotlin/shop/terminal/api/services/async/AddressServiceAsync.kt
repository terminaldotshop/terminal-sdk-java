// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressGetParams
import shop.terminal.api.models.AddressGetResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
    fun delete(params: AddressDeleteParams): CompletableFuture<AddressDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressDeleteResponse>

    /** Get the shipping address with the given ID. */
    fun get(params: AddressGetParams): CompletableFuture<AddressGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: AddressGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressGetResponse>

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /address`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AddressCreateParams
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none()
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /address/{id}`, but is otherwise the same as
         * [AddressServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AddressDeleteParams
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /address/{id}`, but is otherwise the same as
         * [AddressServiceAsync.get].
         */
        @MustBeClosed
        fun get(params: AddressGetParams): CompletableFuture<HttpResponseFor<AddressGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: AddressGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressGetResponse>>
    }
}
