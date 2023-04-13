import Multiselect from 'multiselect-react-dropdown';

const EventFilter = () => {
    return(
            <Multiselect
                isObject={false}
                onKeyPressFn={function noRefCheck(){}}
                onRemove={function noRefCheck(){}}
                onSearch={function noRefCheck(){}}
                onSelect={function noRefCheck(){}}
                options={[
                    'Campus',
                    'Data',
                    'Popularidade'
                ]}
            />
    );
}

export default EventFilter;