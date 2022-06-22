
export default function Button(props) {
    const { onClick, name } = props;

    return (
        <button onClick={onClick}>{name}</button>
    );
};
