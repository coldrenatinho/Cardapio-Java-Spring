 import '../componets/styles/card.css';

interface CardProps {
    price: number;
    title: string;
    image: string;
}   

export function Card({ image, title, price }: CardProps) {
    return (
        <div className="card">
            <img src={image}/>
            <h2>{title}</h2>
            <p><b>Valor: R$ {price}</b></p>
        </div>
    )
}