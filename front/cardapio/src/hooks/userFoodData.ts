import axios, { AxiosPromise } from "axios"
import { foodData } from "../assets/Interface/foodData"
import { useQuery } from "@tanstack/react-query"

const API_FOOD_URL = 'http://localhost:8080/api/v2/food'

const fechData = async (): AxiosPromise<foodData []> => {
    
    const response = axios.get(API_FOOD_URL)
    return response

}
export function useFoodData(){
    const query = useQuery({
        queryFn: fechData,  
        queryKey: ['food-data'],
        retry: 2,
    })

    return {
        ...query,
        data: query.data?.data,
    }
}