(ns api-consumer.core
    (:require [org.httpkit.client :as http]))

(http/get "http://localhost:5000"
          (fn [{:keys [status headers body error]}] ;; asynchronous handle response
            (if error
              (println "Failed, exception is " error)
              (println "Async HTTP GET: " status))))
