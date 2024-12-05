// src/App.jsx
import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
    const [message, setMessage] = useState('12345');
    // const [ipMessage, setIpMessage] = useState('');  // IP 메시지를 저장할 상태
    useEffect(() => {
        // Spring Boot의 /api/hello API 호출
        axios.get('http://52lb2-250348580.ap-northeast-2.elb.amazonaws.com:80/api/hello')
        // axios.get('http://localhost:8080/api/hello')

            .then(response => {
                setMessage(response.data);  // 서버에서 받은 데이터를 상태에 저장
            })
            .catch(error => {
                if (error.response) {
                    // 서버가 응답을 보내고 오류가 있을 때
                    console.error("Error response:", error.response);
                    console.error("Status code:", error.response.status); // 상태 코드
                    console.error("Response data:", error.response.data); // 응답 데이터
                } else if (error.request) {
                    // 서버가 응답을 주지 않거나 네트워크 오류가 있을 때
                    console.error("Error request:", error.request);
                } else {
                    // 요청을 설정하는 도중 발생한 오류
                    console.error("Error message:", error.message);
                }
            });
    }, []);



    // 새로운 API 호출: /api/ip fdgfdgfdgdfgdfgdfg
    //     axios.get('http://localhost:8080/api/ip')
    //         .then(response => {
    //             setIpMessage(response.data);  // IP 관련 데이터를 상태에 저장
    //         })
    //         .catch(error => {
    //             console.error("Error calling /api/ip:", error);
    //         });
    // }, []);

    return (
        <div>
            <h1>Welcome to My React App!</h1>
            <p>~~~~~~~~~~~~~~~~~~~~~~~~~~hello~~~ {message}</p>  {/* API 호출로 받은 메시지 표시 */}
        </div>
    );
}

export default App;
