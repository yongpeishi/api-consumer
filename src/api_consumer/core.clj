(ns api-consumer.core
    (:require [org.httpkit.client :as http]
              [cheshire.core :refer :all]))

(let [response1 (http/get "http://localhost:5000/")]
  (println "response1's body: " (parse-string (:body @response1))))
